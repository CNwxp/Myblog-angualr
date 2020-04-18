import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ArticledetailComponent } from './articledetail.component';


const routes: Routes = [
  { path: '', component: ArticledetailComponent}
]
@NgModule({
  declarations: [ArticledetailComponent],
  imports: [RouterModule.forRoot(routes),
  ],
  exports: [RouterModule]
})
export class ArticleDetailRoutingModule { }
