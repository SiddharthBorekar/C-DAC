// /Q.2  Write a program to generate a following #`s trangle
//      #####
//       ####
//        ###
//         ##
//          #
# include <iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter a nummber :";
    cin>>n;
    
    for(int i=n;i>=0;i--){
        for(int j=n;j>=i;j--){
            cout<<" ";
        }
        for(int j=i;j>=0;j--){
            cout<<"#";
        }
        cout<<"\n";
    }
    return 0;
}