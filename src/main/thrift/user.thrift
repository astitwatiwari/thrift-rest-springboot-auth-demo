namespace java com.example.demo

struct TUser{
    1: string userId,
    2: string username,
    3: string password;
}

service TAuthenticationService{
    bool authenticateUser(1: string userName, 2: string password);
}