import { Component, OnInit } from '@angular/core';

import { BackendService } from '../../Service/backend.service';
@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {
  constructor(private data:BackendService) { }

  ngOnInit() {
  }

  getOnClick(){
    this.data.getObject().subscribe((any)=>{ 
      console.log(any);
    });
  }

  sendOnClick(){
    this.data.sendObject();
    console.log("Worked");
  }

}
