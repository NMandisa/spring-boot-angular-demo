import {Component, OnInit} from '@angular/core';
import {ProductService} from '../../services/product/product.service';

@Component({
  selector: 'app-product-list',
  standalone: true,
  imports: [],
  templateUrl: './product-list.component.html',
  styleUrl: './product-list.component.css',
  providers: [ProductService]
})
export class ProductListComponent implements OnInit{
  ngOnInit() {
    this.list();
  }
  constructor(
    public productService: ProductService
  ) {}

  list() {
    this.productService.getProducts().subscribe((res) => {
      console.log('Products - ' +res);
    });
  }
}
