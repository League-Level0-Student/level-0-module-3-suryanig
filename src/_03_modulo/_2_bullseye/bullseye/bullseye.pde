
void setup() {
 
  // set the size of your sketch
  size(500,500);
}

void draw() {
  for(int i=0;i<8;i++){
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  if(i%2==0){
  fill(0,0,0);
  }
  else{
  fill(250,0,0);
  }
  ellipse(250,250,500-i*60,500-i*60);
  //Use an if statement and modulo to alternate the color of your rings.
  } 
}
