//Sphere.c
//Billy Kwong
//bqkwong
//lab7
//reads in one double value, then prints out the volume and surface area of the sphere whose radius is the value entered.

#include<stdio.h>
#include<stdlib.h>
int main(){
  //Variables
  const double pi = 3.141592654;
  double radius, volume, surfArea;
  //Enter radius
  printf("Enter the radius of the sphere: ");
  scanf(" %lf", &radius);
  //Formula
  volume = (4.0/3.0)*pi*radius*radius*radius;
  surfArea = 4.0*pi*radius*radius;
  //Prints volume and surface area
  printf("The volume is %lf and the surface area is %lf.\n", volume, surfArea);
  return 0;
}
