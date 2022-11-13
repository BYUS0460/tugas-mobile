#include<iostream.h>
#include<conio.h>
#include<string.h>
void main(){
      char kode[10];
      char*nama;
      long Harga,Jumlah,Total;

      clrscr();
      cout<<"Kode Barang  :";
      cin>>Kode;
      if (strcmp(Kode,"A001")==0){
      Nama="Mouse";
      Harga=25000;
      }else if (strcmp(Kode,"A002")==0){
      Nama="keyboard";
      Harga=55000;
      }else if(strcmp(Kode,"A003")==0){
      Nama="card reade";
      Harga=30000;
      }
      cout<<"Nama Barang  :  "<<Nama<<endl;
      cout<<"Harga Barang  : "<<Harga<<endl;
      cout<<"Jumlah  :  ";
      cin>>Jumlah;
      Total=Harga*Jumlah;
      cout<<"Total Harga  :  "<<Total;
      getch();



