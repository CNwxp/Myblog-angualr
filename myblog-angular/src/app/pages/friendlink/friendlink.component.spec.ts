import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FriendlinkComponent } from './friendlink.component';

describe('FriendlinkComponent', () => {
  let component: FriendlinkComponent;
  let fixture: ComponentFixture<FriendlinkComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FriendlinkComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FriendlinkComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
