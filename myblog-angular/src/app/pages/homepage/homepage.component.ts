import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { EditorConfig } from '../article/editor-config';
declare var editormd: any;
@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomepageComponent implements OnInit {
data:any;
Articledatareturn: any;
conf = new EditorConfig();
Articledata:[];
  constructor(
    private httpClient: HttpClient
  ) { }

  ngOnInit(): void {
   this.getArticledata();
  }
   getArticledata(){
    this.httpClient.post('http://localhost:8080/Article/query',null).subscribe(params => {
     this.Articledatareturn=params;
     if(this.Articledatareturn.code=='1001'){
      this.Articledata=this.Articledatareturn.data;
      // this.conf.markdown = this.Articledata['content'];
      // editormd.markdownToHTML('detailmarkdown', this.conf);
     }
   });
 
}
}