// 1. Write a program to generate a following structure:
//           @@@@@
//           @@@@@
//           @@@@@
//           @@@@@
//           @@@@@

# include <iostream>
using namespace std;

// int main(){
//     int n=4;
//     for(int i=0;i<=n;i++){
//         for(int j=0;j<=n;j++){
//             cout<<"@ ";
//         }
//         cout<<endl;
//     }
//     return 0;
// }

//Q.2  Write a program to generate a following #`s trangle
//      #####
//       ####
//        ###
//         ##
//          #

int main(){
    int n=4;
    for(int i=5;i>=1;i--){
        for(int j=5;j>=i;j--){
            cout<<" ";
        }
        for(int j=i;j>=0;j--){
            cout<<"#";
        }
        cout<<"\n";
    }
    return 0;
}