import { Injectable } from '@angular/core';
import { HttpClient , HttpHeaders ,HttpErrorResponse} from '@angular/common/http';
import { Observable , throwError} from 'rxjs';
import { Product } from '../../shared/models/product';
import { retry, catchError } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  // Base url
  baseurl  = 'http://localhost:8082/';
  constructor(private http: HttpClient) {}

  // Http Headers
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
    }),
  };

  getProducts(): Observable<any> {
    //return this.http.get<Product>(`${this.baseurl+"/products"}`);
    return this.http.get<any>(`${this.baseurl}products/`).pipe(retry(1), catchError(this.errorHandler));
  }

  getProduct(id: number): Observable<any> {
    //return this.http.get<Product>(`${this.baseurl}/${id}`);
    return this.http.get<Product>(`${this.baseurl} + '/products/' + ${id}`).pipe(retry(1), catchError(this.errorHandler));
  }

  createProduct(product: Product): Observable<any> {
   // return this.http.post(`${this.baseurl}`, product);
    return this.http.post(`${this.baseurl} + '/products/add/',${this.httpOptions}`,product).pipe(retry(1), catchError(this.errorHandler));
  }

  updateProduct(id: number, product: Product): Observable<any> {
    //return this.http.put(`${this.baseurl}/${id}`, product);
    return this.http.put<any>(`${this.baseurl} + '/products/' + ${id},${this.httpOptions}`,product)
        .pipe(retry(1), catchError(this.errorHandler));
  }

  deleteEmployee(id: number): Observable<any> {
    //return this.http.delete<any>(`${this.baseurl}+/products/delete/+${id}`);
    return this.http.delete<Product>(`${this.baseurl} + '/products/delete/' + ${id}, ${this.httpOptions}`)
      .pipe(retry(1), catchError(this.errorHandler));
  }

  // Error handling
  errorHandler(error:HttpErrorResponse) {
    let errorMessage = '';
    if (error.error instanceof ErrorEvent) {
      // Get client-side error
      errorMessage = error.error.message;
    } else {
      // Get server-side error
      errorMessage = `Error Code: ${error.status}\n Message: ${error.message}`;
    }
    console.log(errorMessage);
    return throwError(() => {return errorMessage;
});
  }
}
