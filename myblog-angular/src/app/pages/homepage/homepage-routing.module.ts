import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomepageComponent } from './homepage.component';
import { ArticledetailComponent } from './articledetail/articledetail.component';
import { AppComponent } from 'src/app/app.component';

const routes: Routes = [
  { path: '', component: HomepageComponent,
},
   {path:'articledetail', component: ArticledetailComponent,
}
];

@NgModule({
  declarations: [ArticledetailComponent,
  ],
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class HomePageRoutingModule { }
