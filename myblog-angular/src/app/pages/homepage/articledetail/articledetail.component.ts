import { Component, OnInit } from '@angular/core';
import { EditorConfig } from '../../article/editor-config';
import { HttpClient } from '@angular/common/http';
import { ActivatedRoute } from '@angular/router';
import { formatDate } from '@angular/common';
declare var editormd: any;
@Component({
  selector: 'app-articledetail',
  templateUrl: './articledetail.component.html',
  styleUrls: ['./articledetail.component.css']
})
export class ArticledetailComponent implements OnInit {
  serialno='';
  data:any;
  Articledatareturn: any;
  conf = new EditorConfig();
  Articledata:[];
    constructor(
      private httpClient: HttpClient,
      public route:ActivatedRoute
    ) { }
  
    ngOnInit(): void {
      this.serialno=this.route.snapshot.queryParams["id"];
      alert(this.serialno);
      this.getArticledata();
     
    }
     getArticledata(){
      const formdata =new FormData();
      formdata.append('serialNo',this.serialno);
      this.httpClient.post('http://localhost:8080/Article/querybyserialNo', formdata).subscribe(params => {
       this.Articledatareturn=params;
       if(this.Articledatareturn.code=='1001'){
        this.Articledata=this.Articledatareturn.data;
         this.conf.markdown = this.Articledata['content'];
         editormd.markdownToHTML('detailmarkdown', this.conf);
       }
     });
   
  }
}
