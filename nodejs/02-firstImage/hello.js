"use strict";

const snooze = () => new Promise(resolve => setTimeout(resolve, 200));

!async function() {
    console.log("");
    console.log("           +-------------------------------------------------------+");
    await snooze();
    await snooze();
    console.log("          /                                                       /|");
    await snooze();
    console.log("         /                                                       / |");
    await snooze();
    console.log("        *-------------------------------------------------------*  |");
    await snooze();
    console.log("        |                                                       |  |");
    await snooze();
    console.log("        |    JavaScript was made for the masses,                |  |");
    await snooze();
    console.log("        |    It lacked types, and modules, and classes.         |  |");
    await snooze();
    console.log("        |    But it became quite the giant,                     |  |");
    await snooze();
    console.log("        |    Because it ran on server and client,               |  |");
    await snooze();
    console.log("        |    Until it crashed both, despite 100 test passes.    | /");
    await snooze();
    console.log("        |                                                       |/");
    await snooze();
    console.log("        *-------------------------------------------------------*");
    console.log();
}();
