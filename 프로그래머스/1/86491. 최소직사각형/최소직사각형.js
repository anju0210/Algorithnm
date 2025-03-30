function solution(sizes) {
    let size = [];
    for(let i=0; i<sizes.length; i++)
        size.push(sizes[i][0]>sizes[i][1]? sizes[i][1] : sizes[i][0]);
    return Math.max(...sizes.flat())*Math.max(...size.flat());
}