import { FormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule ,routingComponents} from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { AdduserComponent } from './components/adduser/adduser.component';
import { AddnewsurveyComponent } from './components/addnewsurvey/addnewsurvey.component';
import { AddnewuserComponent } from './components/addnewuser/addnewuser.component';
import { AddsurveyComponent } from './components/addsurvey/addsurvey.component';
import { AdminhomepageComponent } from './components/adminhomepage/adminhomepage.component';
import { CheckboxComponent } from './components/checkbox/checkbox.component';
import { EdituserComponent } from './components/edituser/edituser.component';
import { ForgetpasswordComponent } from './components/forgetpassword/forgetpassword.component';
import { Index1Component } from './components/index1/index1.component';
import { QuestionComponent } from './components/question/question.component';
import { RadioComponent } from './components/radio/radio.component';
import { SignupComponent } from './components/signup/signup.component';
import { SurveyComponent } from './components/survey/survey.component';
import { SurveyreportComponent } from './components/surveyreport/surveyreport.component';
import { TextareaComponent } from './components/textarea/textarea.component';
import { TextfieldComponent } from './components/textfield/textfield.component';
import { UserComponent } from './components/user/user.component';
import { User1Component } from './components/user1/user1.component';
import { User2Component } from './components/user2/user2.component';
import { UserhomepageComponent } from './components/userhomepage/userhomepage.component';
import { UserreportComponent } from './components/userreport/userreport.component';
import { UserresultComponent } from './components/userresult/userresult.component';
import { UsersurveyComponent } from './components/usersurvey/usersurvey.component';
import { NumberComponent } from './components/number/number.component';

@NgModule({
  declarations: [
    AppComponent,
    routingComponents,
    HomeComponent,
    AdduserComponent,
    AddnewsurveyComponent,
    AddnewuserComponent,
    AddsurveyComponent,
    AdminhomepageComponent,
    CheckboxComponent,
    EdituserComponent,
    ForgetpasswordComponent,
    Index1Component,
    QuestionComponent,
    RadioComponent,
    SignupComponent,
    SurveyComponent,
    SurveyreportComponent,
    TextareaComponent,
    TextfieldComponent,
    UserComponent,
    User1Component,
    User2Component,
    UserhomepageComponent,
    UserreportComponent,
    UserresultComponent,
    UsersurveyComponent,
    NumberComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
