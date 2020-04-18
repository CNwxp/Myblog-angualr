import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HomepageComponent } from './homepage.component';
import { FormsModule } from '@angular/forms';
import { NzInputModule, NzButtonModule, NzListModule, NzLayoutModule, NgZorroAntdModule } from 'ng-zorro-antd';
import { HomePageRoutingModule } from './homepage-routing.module';
import { ArticledetailComponent } from './articledetail/articledetail.component';
import { AppRoutingModule } from 'src/app/app-routing.module';
import { RouterModule } from '@angular/router';



@NgModule({
  declarations: [HomepageComponent],
  imports: [
    HomePageRoutingModule,
    CommonModule,
    NzListModule ,
  ]
})
export class HomepageModule { }
