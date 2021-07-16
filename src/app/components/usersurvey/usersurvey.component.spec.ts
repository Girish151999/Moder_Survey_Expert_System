import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UsersurveyComponent } from './usersurvey.component';

describe('UsersurveyComponent', () => {
  let component: UsersurveyComponent;
  let fixture: ComponentFixture<UsersurveyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UsersurveyComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UsersurveyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});