/**
 * @param {number[]} derived
 * @return {boolean}
 */
var doesValidArrayExist = function(derived) {
    let xr = 0;
        for (let val of derived) {
            xr ^= val;
        }
        return xr === 0;
};