import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-index1',
  templateUrl: './index1.component.html',
  styleUrls: ['./index1.component.css']
})
export class Index1Component implements OnInit {
  mail:string;
  password:string;
  constructor(private router:Router) { 

  }

  ngOnInit(): void {
  }
  myfunction(){
    if(this.mail=="admin@gmail.com" && this.password=="123"){
      this.router.navigateByUrl('adduser');
    }else{
      this.router.navigateByUrl('user2');
    }
  }
}
