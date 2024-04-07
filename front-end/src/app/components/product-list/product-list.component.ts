import {Component, OnInit} from '@angular/core';
import {ProductService} from '../../services/product/product.service';
import {RouterOutlet} from "@angular/router";
import {LeftSideBarComponent} from "../../shared/ui/left-side-bar/left-side-bar.component";
import {ProductSideBarComponent} from "../../shared/ui/product-side-bar/product-side-bar.component";
import {NavBarComponent} from "../../shared/ui/nav-bar/nav-bar.component";
import {SignInComponent} from "../../shared/ui/sign-in/sign-in.component";
import {HeaderComponent} from "../../shared/ui/header/header.component";
import {FooterComponent} from "../../shared/ui/footer/footer.component";

@Component({
  selector: 'app-product-list',
  standalone: true,
  imports: [
    RouterOutlet,
    LeftSideBarComponent,
    ProductSideBarComponent,
    NavBarComponent,
    SignInComponent,
    HeaderComponent,
    FooterComponent
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
