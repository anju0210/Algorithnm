process.stdin.setEncoding('utf8');
process.stdin.on('data', data => {
    const n = data.split(" ");
    for(let i=0; i<n[1]; i++){
        for(let j=0; j<n[0]; j++){
            process.stdout.write("*");
        }
        console.log();
    }
});