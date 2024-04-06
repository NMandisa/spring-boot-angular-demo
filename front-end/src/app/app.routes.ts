import {Routes} from '@angular/router';
import {BrandComponent} from "./components/brand/brand.component";
import {CartComponent} from "./components/cart/cart.component";
import {CategoryComponent} from "./components/category/category.component";
import {PageNotFoundComponent} from "./shared/ui/page-not-found/page-not-found.component";
import {HomeComponent} from "./components/home/home.component";
import {ProductListComponent} from "./components/product-list/product-list.component";
import {ProductAddComponent} from "./components/product-add/product-add.component";
import {ProductEditComponent} from "./components/product-edit/product-edit.component";
import {ProductDeleteComponent} from "./components/product-delete/product-delete.component";
import {ProductDescriptionComponent} from "./components/product-description/product-description.component";
import {ProductReviewsComponent} from "./components/product-reviews/product-reviews.component";
import {ProductComponent} from "./components/product/product.component";

export const routes: Routes = [
  { path: '',
    pathMatch: 'full',
    redirectTo: '' },
  { path: '',
    title:'Home',
    component:HomeComponent},
  { path: 'products',
    title:"Product",
    component: ProductListComponent,
  children: [
      {
        path: 'add-product', // child route path
        title: 'Add Product',
        component: ProductAddComponent, // child route component that the router renders
      },
    {
      path: ':id/edit-product', // child route path
      title: 'Edit Product',
      component: ProductEditComponent, // child route component that the router renders
    },
    {
      path: 'delete/product/:id', // child route path
      title: 'Delete Product',
      component: ProductDeleteComponent, // child route component that the router renders
    },
    {
      path: ':id', // child route path
      title: 'Product Description',
      component: ProductDescriptionComponent, // child route component that the router renders
      children : [
        {
          path: ':product-reviews', // child route path
          title: 'Product Reviews',
          component: ProductReviewsComponent, // child route component that the router renders
        }
      ]
    }
    ]},
  { path: 'brand',
    title:"Brand",
    component: BrandComponent },
  { path: 'cart',
    title:"Cart ",
    component: CartComponent },
  { path: 'category',
    title:"Category",
    component: CategoryComponent },
  { path: 'product',
    title:"Product...",
    component: ProductComponent },
  { path: '**',
    title:"404",
    component: PageNotFoundComponent}
];
/*{
  path: 'first-component',
    component: FirstComponent, // this is the component with the <router-outlet> in the template
  children: [
  {
    path: 'child-a', // child route path
    component: ChildAComponent, // child route component that the router renders
  },
  {
    path: 'child-b',
    component: ChildBComponent, // another child route component that the router renders
  },
],*/


/*
{ path: '',
  title:'xzy',
  pathMatch: 'full',
  redirectTo: 'home' },*/

/*,path: '',
  title:'xzy',
  component:HomeComponent},*/
