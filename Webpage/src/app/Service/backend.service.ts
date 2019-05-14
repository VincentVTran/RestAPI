import { Injectable, OnInit } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import dataObjectInterface from '../Interfaces/dataObjectInterface' //Does not need {} due to default export
@Injectable({
  providedIn: 'root'
})
export class BackendService implements OnInit {

  constructor(private http: HttpClient) { 
  }
  
  ngOnInit(){
  }

  getSimpleArray():Observable<any[]> {
    return this.http.get<any[]>("http://localhost:8080/returnArray"); //Returns observable
  }

  getDataObject():Observable<any> {
    return this.http.get<any>("http://localhost:8080/returnObject");
  }
  
  sendSimplePrimitives():void {
    var obj:dataObjectInterface = {
      id: "4",
      name: "Test"
    }
    this.http.post("http://localhost:8080/sendData",obj)
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
