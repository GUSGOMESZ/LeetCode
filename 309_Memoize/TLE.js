function memoize(fn) {
    
    let cache = [];

    return function(...args) {

        let found = false;
        let currentTriplet = [];

        for(let i = 0; i < cache.length; i++) {
            currentTriplet = cache[i];

            if(currentTriplet[0] == args[0] && currentTriplet[1] == args[1]) {
                found = true;
                break;
            }
        }

        if(found) {
            return currentTriplet[2];
        }

        let newCache = [];
        let result = fn(args[0], args[1]);

        newCache.push(args[0]);
        newCache.push(args[1]);
        newCache.push(result);

        cache.push(newCache);

        return result;
    }
}
