import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ArticleComponent } from './article.component';
import { ArticleRoutingModule } from './article-routing.module';
import { FormsModule } from '@angular/forms';
import { EditorMdDirective } from './editor-md.directive';
import { NzInputModule, NzButtonModule } from 'ng-zorro-antd';



@NgModule({
  declarations: [
  ArticleComponent,
  EditorMdDirective
  ],
  imports: [
  ArticleRoutingModule,
  FormsModule,
  NzInputModule ,
  NzButtonModule 
  ],
  exports: [ArticleComponent]
})
export class ArticleModule { }
