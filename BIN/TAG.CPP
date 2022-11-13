#iclude<iostream.h>
#include<conio.h>
#include<string.h>


main()
{
		 int a,b,c,dabsen,yuges,uts,uas,total;
		 char name[25],nim[10],k[10],ket[10]

		 cout<<"imput nama :";
		 cin.get(nama,250);
		 cin>>nim;
		 cout<<endl;

		 cout<<"Imput nilai absen :";
		 cin>>absen;
		 cout<<"Imput nilai tugas :";
		 cin>>tugas;
		 cout<<"Imput nilai uts   :";
		 cin>>uts;
		 cout<<"Imput nilai uas   :";
		 cin<<uas;


		 a=(absen*0,40);
		 b=(tugas*0,10);
		 c=(uts*0,20);
		 d=(uas*0,30);

		 cout<<endl;

		 total=a+b+c+d;
		 if(total>=50){
		 strcpy(ket,"LULUS");
		 } else if(total<=49){
		 strcpy(ket,"TIDAK LULUS");
		 }

		 cout<<"Nama :"<<Bayu setiawan<<endl;
		 cout<<"Nim  :"<<312110470<<endl;
		 cout<<"Total Nilai:"<<total<<","<<"keterangan:"<<ket<<endl;
		 cout<<endl;

		 getch();
		 return 0;