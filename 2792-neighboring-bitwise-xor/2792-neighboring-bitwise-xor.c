bool doesValidArrayExist(int* derived, int derivedSize) {
    int z = 0;
    for(int i = 0;i < derivedSize;i++){
        z ^= derived[i]; 
    }
    return (z == 0)?true:false;
}