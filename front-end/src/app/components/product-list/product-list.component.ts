import {Component, OnInit} from '@angular/core';
import {ProductService} from '../../services/product/product.service';
import {RouterOutlet} from "@angular/router";
import {LeftSideBarComponent} from "../../shared/ui/left-side-bar/left-side-bar.component";
import {ProductSideBarComponent} from "../../shared/ui/product-side-bar/product-side-bar.component";

@Component({
  selector: 'app-product-list',
  standalone: true,
  imports: [
    RouterOutlet,
    LeftSideBarComponent,
    ProductSideBarComponent
  ],
  templateUrl: './product-list.component.html',
  styleUrl: './product-list.component.css',
  providers: [ProductService]
})
export class ProductListComponent {
  /*ngOnInit() {
    this.list();
  }*/ //was for testing purpose
  constructor(
    public productService: ProductService
  ) {}

  list() {
    this.productService.getProducts().subscribe((res) => {
      console.log('Products - ' +res);
    });
  }
}
