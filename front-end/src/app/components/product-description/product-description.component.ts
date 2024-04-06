import { Component } from '@angular/core';
import {RouterOutlet} from "@angular/router";

@Component({
  selector: 'app-product-details',
  standalone: true,
  imports: [
    RouterOutlet
  ],
  templateUrl: './product-description.component.html',
  styleUrl: './product-description.component.css'
})
export class ProductDescriptionComponent {

}
