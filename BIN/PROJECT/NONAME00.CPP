#include<iostream>
#include<string>

nama siswa std;
int main(){
	 float tabsen,uts,uas,hasil,a,b,c,d;
	 string sts,exit;

	 cout<<"Masukkan nilai tabsen : ";
	 cin >>tabsen;

	 cout<<"masukkan nilai tugas  : ";
	 cin >>tugas;

	 cout<<"masukkan nilai UTS    : ";
	 cin >>uts;

	 cout<<"masukkan nilai UAS    : ";
	 cin >>uas;

	 a = tabsen *40/100;
	 b = tugas * 10/100;
	 c = UTS  *20/100;
	 d = UAS *30/100;

	 hasil = a+b+c+d

	 if (hasil >=50){
		sts ="LULUS";
	 }
	 else{
		sts ="TIDAK LULUS";
	 }

	 cout<<"Nilai Akhir ="<<hasil<<endl;
	 cout<<mahasiswa : "<<;
	 cin>>exit;
	 getch()
	 return 0;
}
