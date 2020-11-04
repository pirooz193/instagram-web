<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>HW14Test</title>
    <style>
        header {
            background-color: dodgerblue;
            padding: 5px;
            text-align: left;
            font-size: 35px;
            color: white;
        }

        label {
            background-color: darkseagreen;
            color: whitesmoke;
        }

        /*div {
            color: blue;
            font-size: 13px;
        }*/

        .topnav {
            overflow: hidden;
            background-color: royalblue;
        }


        .topnav a {
            float: left;
            color: white;
            text-align: center;
            padding: 5px 80px;
            text-decoration: none;
            font-size: 17px;
        }

        .topnav a:hover {
            background-color: #ddd;
            color: royalblue;
        }

        nav {
            float: left;
            width: 15%;
            height: 600px;
            background: Azure;
            padding: 5px;
        }

        nav ul {
            list-style-type: none;
            padding: 0;
        }

        article {
            background-color: Azure;
        }

        .warning {
            background-color: #ffffcc;
            border-left: 6px solid #ffeb3b;
            margin-right: 50px;
        }
    </style>

</head>
<body>
<header>
    <div style="color: whitesmoke;font-size: 30px">MaktabHomeWork14.ir<br>
        <div style="font-size: 15px;color: whitesmoke">Just little fun
            <div align="right" style ="padding-bottom: 30px">
                <form >
                    <input type="search" > <input type="submit" name="click" value="click">
                </form>
            </div>
        </div>
    </div>


</header>
<topnav>
    <div class="topnav">
        <a class="active" href="#home">Home</a>
        <a href="#about">About</a>
        <a href="#contact">Contact</a>
        <a href="#link">Link</a>
    </div>
</topnav>
<section>
    <nav>
        <div style="color: blue;
            font-size: 13px;">
            <label>Markup</label>
            <div>First webpage guide<br>HTML</div>
            <br>
            <label>Style and layot</label>
            <div>CSS</div>
            <br>
            <label>Browser Scripting</label>
            <div>Java Script<br>AJAX<br>VBscript</div>
            <br>
            <label>Server Scripting</label>
            <div>PHP<br>ASP</div>
            <br>
            <label>Web planning</label>
            <div>PHP<br>ASP</div>
            <div>RSS</div>
            <br>
            <label>Web Mechanics</label>
            <div>Debugging</div>
        </div>

    </nav>
</section>


<article>
    <br>
    <br>
    <h1 style="background-color: lightgrey;font-family: ArialBlack, Gadget, sans-serif">HTML exercises</h1>
    <div>
        <p>HTML lists allow web developers to group a set of related items in lists.</p>
        <h4 style="font-family: Alatsi">Jump to :</h4>
        <a href="#Basics">Basics |</a><a href="#Text"> Text |</a><a href="#Text formatting"> text formatting |</a>
        <a href="#Links"> Links |</a><a href="#Images"> Images |</a>

        <dl>
            <dt><h1 style="background-color: navajowhite ;color:
            midnightblue;font-family:ArialBlack, Gadget, sans-serif ">
                HTML
                basics exercises</h1></dt>
            <li>lists allow web developers to group a set of related items in lists.[<a href="#Link">Link</a>]</li>
            <br>
            <li>lists allow web developers to group a set of related items in lists.[<a href="#Link">Link</a>]</li>
            <br>
            <li>lists allow web developers to group a set of related items in lists.[<a href="#Link">Link</a>]</li>
            <br>
            <li>lists allow web developers to group a set of related items in lists.[<a href="#Link">Link</a>]</li>
            <br>
            <li>lists allow web developers to group a set of related items in lists.[<a href="#Link">Link</a>]</li>
            <br>
            <li>lists allow web developers to group a set of related items in lists.[<a href="#Link">Link</a>]</li>
            <br>
        </dl>

        <div class="warning">
            <p><strong>Warning!</strong> Some text...</p>
        </div>
    </div>


</article>
<footer></footer>

</body>
</html>
