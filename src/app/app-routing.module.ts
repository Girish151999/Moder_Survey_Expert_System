import { User1Component } from './components/user1/user1.component';
import { TextfieldComponent } from './components/textfield/textfield.component';
import { User2Component } from './components/user2/user2.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdduserComponent } from './components/adduser/adduser.component';
import { SignupComponent } from './components/signup/signup.component';
import { ForgetpasswordComponent } from './components/forgetpassword/forgetpassword.component';
import { AddnewsurveyComponent } from './components/addnewsurvey/addnewsurvey.component';
import { AddnewuserComponent } from './components/addnewuser/addnewuser.component';
import { AddsurveyComponent } from './components/addsurvey/addsurvey.component';
import { AdminhomepageComponent } from './components/adminhomepage/adminhomepage.component';
import { CheckboxComponent } from './components/checkbox/checkbox.component';
import { EdituserComponent } from './components/edituser/edituser.component';
import { HomeComponent } from './components/home/home.component';
import { QuestionComponent } from './components/question/question.component';
import { RadioComponent } from './components/radio/radio.component';
import { SurveyComponent } from './components/survey/survey.component';
import { SurveyreportComponent } from './components/surveyreport/surveyreport.component';
import { TextareaComponent } from './components/textarea/textarea.component';
import { UserComponent } from './components/user/user.component';
import { UserhomepageComponent } from './components/userhomepage/userhomepage.component';
import { UserreportComponent } from './components/userreport/userreport.component';
import { UserresultComponent } from './components/userresult/userresult.component';
import { UsersurveyComponent } from './components/usersurvey/usersurvey.component';
import { Index1Component } from './components/index1/index1.component';
import { NumberComponent } from './components/number/number.component';

const routes: Routes = [
  {path:'',component:Index1Component},
  {path:'addnewsurvey',component:AddnewsurveyComponent},
  {path:'addnewuser',component:AddnewuserComponent},
  {path:'addsurvey',component:AddsurveyComponent},
  {path:'adduser',component:AdduserComponent},
  {path:'adminhomepage',component:AdminhomepageComponent},
  {path:'checkbox',component:CheckboxComponent},
  {path:'edituser',component:EdituserComponent},
  {path:'forgetpassword',component:ForgetpasswordComponent},
  {path:'number',component:NumberComponent},

  // {path:'home',component:HomeComponent},
  {path:'question',component:QuestionComponent},
  {path:'radio',component:RadioComponent},
  {path:'signup',component:SignupComponent},
  {path:'survey',component:SurveyComponent},
  {path:'surveyreport',component:SurveyreportComponent},
  {path:'textarea',component:TextareaComponent},
  {path:'textfield',component:TextfieldComponent},
  {path:'user',component:UserComponent},
  {path:'user1',component:User1Component},
  {path:'user2',component:User2Component},
  {path:'userhomepage',component:UserhomepageComponent},
  {path:'userreport',component:UserreportComponent},
  {path:'userresult',component:UserresultComponent},
  {path:'usersurvey',component:UsersurveyComponent},
  {path:'index1',component:Index1Component}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents=[AddnewsurveyComponent,AddnewuserComponent,AddsurveyComponent,AdduserComponent,AdminhomepageComponent,
  CheckboxComponent,EdituserComponent,ForgetpasswordComponent,NumberComponent,HomeComponent,QuestionComponent,RadioComponent,
  SignupComponent,SurveyComponent,SurveyreportComponent,TextareaComponent,TextfieldComponent,UserComponent,
  User1Component,User2Component,UserhomepageComponent,UserreportComponent,UserresultComponent,UsersurveyComponent,Index1Component]
