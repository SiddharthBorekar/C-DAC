# include<iostream>
using namespace std;
// QUE1
// int main(){
//     for(int i=1;i<=4;i++){               
//         for (int j=1;j<=4;j++){
//         cout<<" * ";
//     }
//      cout<<endl;
//     }
//     return 0;
// }

//QUE2
// int main(){
//     int i,j;
//     for(i=0;i<=3;i++){
//         for(j=0;j<=i+1;j++){
//             cout<<" * ";
//         }
//         cout<<endl;
//     }
//     return 0;
// }

// QUE3
// int main(){
//     int i ,j;
//     for(i=0;i<=3;i++){
//         for(j=0;j<=i;j++){
//             cout<<""<<i+1;
//         }
//         cout<<endl;
//     }
// return 0;
// }

//QUE4
// int main(){
//     for(int i=0;i<=3;i++){
//         for(int j=0;j<=i;j++){
//             cout<<" "<<j+1;
//         }
//         cout<<endl;
//     }
//     return 0;
// }

//QUE5
// int main(){
//     int n=4 ,num=1;
//     for(int i=0;i<=n;i++){
//         for(int j=0;j<=n;j++){
//             cout<<" ";
//             for(int j=0;j<n-1;j++){
//                 cout<<i+1;
//             }
//             cout<<endl;
//         }
//     }
//     return 0;
// }


//QUE6
int main(){
    int n=4;
    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
            cout<<" "<<i+1;
        }
        cout<<endl;
    }
    return 0;
}