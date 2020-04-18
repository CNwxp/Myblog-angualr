import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ArticledetailComponent } from './articledetail.component';
import { HomePageRoutingModule } from '../homepage-routing.module';
import { ArticleDetailRoutingModule } from './articledetail.routing.module';



@NgModule({
  declarations: [ArticledetailComponent],
  imports: [
    ArticleDetailRoutingModule
  ]
})
export class ArticledetailModule { }
