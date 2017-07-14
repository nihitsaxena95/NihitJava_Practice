interface Darea {
default double sqarea(double l) {
double ar = l*l;
return ar;
}
default double recarea(double l,double b) {
double ar = l*b;
return ar;
}
default double cirarea(double rad) {
double arr = 3.14*rad*rad;
return arr;
}
}