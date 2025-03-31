function solution(s) {
    let i, j, key;
    let arr = s.split('');
    for(i=1; i<arr.length; i++){
        key = arr[i];
        for(j=i-1; j>=0; j--){
            if(key>arr[j])
                arr[j+1] = arr[j];
            else
                break;
        }
        arr[j+1] = key;
    }
    return arr.join('');
}