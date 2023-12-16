#include <stdio.h>
 int main(){
     int i;
     char s[1000];
     scanf("%s\n%d", s, &i);
     printf("%c", s[i-1]);
     return 0;
 }