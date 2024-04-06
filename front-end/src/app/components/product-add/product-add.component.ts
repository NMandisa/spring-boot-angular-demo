import {Component} from '@angular/core';
import {ProductService} from '../../services/product/product.service';

@Component({
  selector: 'app-product-add',
  standalone: true,
  imports: [],
  templateUrl: './product-add.component.html',
  styleUrl: './product-add.component.css',
  providers: [ProductService]
})
export class ProductAddComponent{
}
