import {Routes} from '@angular/router';
import {BrandComponent} from "./components/brand/brand.component";
import {CartComponent} from "./components/cart/cart.component";
import {CategoryComponent} from "./components/category/category.component";
import {PageNotFoundComponent} from "./shared/ui/page-not-found/page-not-found.component";
import {HomeComponent} from "./components/home/home.component";
import {ProductListComponent} from "./components/product-list/product-list.component";

export const routes: Routes = [
  { path: '',
    pathMatch: 'full',
    redirectTo: '' },
  { path: '',
    title:'Home',
    component:HomeComponent},
  { path: 'product-list',
    title:"Product",
    component: ProductListComponent },
  { path: 'brand',
    title:"Brand",
    component: BrandComponent },
  { path: 'cart',
    title:"Cart ",
    component: CartComponent },
  { path: 'category',
    title:"Category",
    component: CategoryComponent },
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
