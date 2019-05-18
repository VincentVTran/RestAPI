import { Injectable, OnInit } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import dataObjectInterface from '../Interfaces/dataObjectInterface' //Does not need {} due to default export
import { AnimationStyleNormalizer } from '@angular/animations/browser/src/dsl/style_normalization/animation_style_normalizer';
@Injectable({
  providedIn: 'root'
})
export class BackendService implements OnInit {

  constructor(private http: HttpClient) { 
  }
  
  ngOnInit(){
  }

  getObject():Observable<AnimationStyleNormalizer> {
    return this.http.get<any>("http://localhost:8080/test"); //Returns observable
  }

  sendObject():void {
    var obj = {
      username:"TestUser",
      password:"TestPassword"
    }
    this.http.post("http://localhost:8080/test",obj).subscribe((data)=>{console.log(data)});
  }

  private handleError(error: any) {
    console.error('Server error:', error);
    if (error.error instanceof Error) {
        const errMessage = error.error.message;
        return Observable.throw(errMessage);
    }
    return Observable.throw(error || 'Node.js server error');
  }
}
