import { Component } from '@angular/core';
import {MatSidenavContainer,MatSidenav} from "@angular/material/sidenav";
import {MatAnchor} from "@angular/material/button";
import {RouterLink} from "@angular/router";
import {MatCard, MatCardContent, MatCardTitle} from "@angular/material/card";

@Component({
  selector: 'app-product-side-bar',
  standalone: true,
  imports: [
    MatSidenavContainer, MatSidenav,
    MatAnchor,
    RouterLink, MatCardContent, MatCardTitle, MatCard
  ],
  templateUrl: './product-side-bar.component.html',
  styleUrl: './product-side-bar.component.css'
})
export class ProductSideBarComponent {

}
