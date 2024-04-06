import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LeftSideBarComponent } from './left-side-bar.component';

describe('SideBarComponent', () => {
  let component: LeftSideBarComponent;
  let fixture: ComponentFixture<LeftSideBarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [LeftSideBarComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LeftSideBarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
