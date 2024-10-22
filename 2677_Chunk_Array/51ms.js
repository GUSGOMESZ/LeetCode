var chunk = function(arr, size) {

    let ret = [], aux = [];

    for(let i = 0; i < arr.length; i++) {
        
        aux.push(arr[i]); 

        if(aux.length == size) {
            ret.push(aux); 
            aux = []; 
        }
    }

    if(aux.length > 0) {
        ret.push(aux); 
    }

    return ret;
};
