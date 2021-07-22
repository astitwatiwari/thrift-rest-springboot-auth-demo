namespace java com.example.demo

struct TPongResponse{
    1: list<i32> items;
}

service TPingPongService{
    TPongResponse ping();
}