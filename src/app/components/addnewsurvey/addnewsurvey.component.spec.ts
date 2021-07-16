import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddnewsurveyComponent } from './addnewsurvey.component';

describe('AddnewsurveyComponent', () => {
  let component: AddnewsurveyComponent;
  let fixture: ComponentFixture<AddnewsurveyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddnewsurveyComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddnewsurveyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
