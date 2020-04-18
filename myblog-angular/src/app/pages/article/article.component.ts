import { Component, OnInit } from '@angular/core';
import { EditorConfig } from './editor-config';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-article',
  templateUrl: './article.component.html',
  styleUrls: ['./article.component.css']
})
export class ArticleComponent implements OnInit {
  constructor(
    private httpClient: HttpClient
  ) { }

  ngOnInit(): void {
}
datareturn:any;
conf = new EditorConfig();
isLoadingOne=false;
markdown = '';
inputtitle:string|null;
inputtags= '';
// 同步属性内容
syncModel(str): void {
  this.markdown = str;
}
//发布文章
submit(){
  const formdata =new FormData();
  formdata.append('title',this.inputtitle);
  formdata.append('content',this.markdown);
  formdata.append('tag',this.inputtags);
 this.httpClient.post('http://localhost:8080/Article/save',formdata).subscribe(params => {
  this.datareturn=params;
  if(this.datareturn=='1001')
  alert('发不成功')
 });

 }
}
