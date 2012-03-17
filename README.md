<h4 style="font-size: 13pt; line-height: normal; margin-bottom: 4px; margin-left: 0px; margin-right: 0px; margin-top: 25px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
Scala Dojo 02 - funs with lists
</h4>

<h4 style="background-color: white; font-family: Arial, Helvetica, FreeSans, sans-serif; font-size: 13pt; margin-bottom: 4px; margin-left: 0px; margin-right: 0px; margin-top: 25px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px; text-align: left;">
  Summary
</h4>

<div style="background-color: white; font-family: Arial, Helvetica, FreeSans, sans-serif; font-size: 14px; line-height: 17px; margin-bottom: 10px; margin-top: 10px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px; text-align: left;">
  This weeks dojo should start to push you a little harder and you may need more than the hour to complete all the challenges. Along the way you will be introduced to Scala's <a class="external-link" href="http://twitter.github.com/scala_school/collections.html" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">Lists</a> and <a class="external-link" href="http://www.scala-lang.org/node/133" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">functions</a>, these two pages are good starts on the subject;
</div>

<ul style="background-color: white; font-family: Arial, Helvetica, FreeSans, sans-serif; font-size: 14px; line-height: 17px; text-align: left;">
  <li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
    Lists - <a class="external-link" href="http://twitter.github.com/scala_school/collections.html" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">http://twitter.github.com/scala_school/collections.html</a>
  </li>
  <li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
    Functions - <a class="external-link" href="http://www.scala-lang.org/node/133" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">http://www.scala-lang.org/node/133</a>
  </li>
</ul>

<div style="text-align: left;">
  <span style="font-family: Arial, Helvetica, FreeSans, sans-serif; font-size: x-small;"><span style="line-height: 17px;"><a href="http://stuartleneghan.blogspot.com/2012/03/scala-dojos.html">Go here to see an overiew of this series of Scala dojos</a></span></span>
</div>

<h4 style="background-color: white; font-family: Arial, Helvetica, FreeSans, sans-serif; font-size: 13pt; margin-bottom: 4px; margin-left: 0px; margin-right: 0px; margin-top: 25px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px; text-align: left;">
  <a href="http://www.blogger.com/blogger.g?blogID=3769493724401867109" name="ScalaDojo02-funswithlists-FunswithLists"></a>Funs with Lists
</h4>

<div style="background-color: white; font-family: Arial, Helvetica, FreeSans, sans-serif; font-size: 14px; line-height: 17px; margin-bottom: 10px; margin-top: 10px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px; text-align: left;">
  There are 8 tests that you will need to go green, plus a bonus one at the end for 2 additional points. This week the tests are not exhaustive and so a certain amount of good sport is expected and as such points will be deducted for implementations that are not in the spirit of the game, for example hard coding return values. You'll also find some tests offer bonus points for implementing them in a particular way. <a class="external-link" href="https://github.com/leneghan/scala_dojoscala_dojo_02_funswithlists" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">The skeleton maven project I have created for the dojo can be found here on github</a>, as last time you should not change the existing tests, but feel free to add new ones along the way.
</div>

<h4 style="background-color: white; font-family: Arial, Helvetica, FreeSans, sans-serif; font-size: 13pt; margin-bottom: 4px; margin-left: 0px; margin-right: 0px; margin-top: 25px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px; text-align: left;">
  <a href="http://www.blogger.com/blogger.g?blogID=3769493724401867109" name="ScalaDojo02-funswithlists-Gettingthecode"></a>Getting the code
</h4>

<div style="background-color: white; font-family: Arial, Helvetica, FreeSans, sans-serif; font-size: 14px; line-height: 17px; margin-bottom: 10px; margin-top: 10px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px; text-align: left;">
  To get started you can <a class="external-link" href="https://github.com/leneghan/scala_dojo_02_funswithlists" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">go to the repo</a> and fork the project into your own github repository by clicking the fork button on the top right. This is the preferred method as it means we can easily share our solutions with each other but if you don't wish to do this you can create a local copy from my repository by simply executing the git clone command.
</div>

<ol style="background-color: white; font-family: Arial, Helvetica, FreeSans, sans-serif; font-size: 14px; line-height: 17px; text-align: left;">
  <li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
    go to <a class="external-link" href="https://github.com/leneghan/scala_dojo_02_funswithlists" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">https://github.com/leneghan/scala_dojo_02_funswithlists</a>
  </li>
  <li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
    click fork button on the top right of the screen
  </li>
  <li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
    <em>git clone <a class="external-link" href="https://github.com/" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">https://github.com/</a><GIT_HUB_NAME>/scala_dojo_02_funswithlists.git</em>
  </li>
</ol>

<div style="background-color: white; font-family: Arial, Helvetica, FreeSans, sans-serif; font-size: 14px; line-height: 17px; margin-bottom: 10px; margin-top: 10px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px; text-align: left;">
  or
</div>

<div class="preformatted panel" style="background-attachment: initial; background-clip: initial; background-color: white; background-image: initial; background-origin: initial; border-bottom-color: rgb(102, 153, 204); border-bottom-style: solid; border-bottom-width: 1px; border-left-color: rgb(102, 153, 204); border-left-style: solid; border-left-width: 1px; border-right-color: rgb(102, 153, 204); border-right-style: solid; border-right-width: 1px; border-top-color: rgb(102, 153, 204); border-top-style: solid; border-top-width: 1px; font-family: Arial, Helvetica, FreeSans, sans-serif; font-size: 14px; line-height: 17px; margin-bottom: 10px; margin-left: 20px; margin-right: 20px; margin-top: 10px; overflow-x: hidden; overflow-y: hidden; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px; text-align: left;">
  <div class="preformattedContent panelContent" style="background-attachment: initial; background-clip: initial; background-image: initial; background-origin: initial; font-size: 0.95em; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 12px; padding-left: 10px; padding-right: 10px; padding-top: 12px;">
    <pre style="font-family: 'Courier New', Courier, monospace; line-height: 1.3; overflow-x: auto; overflow-y: auto; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">git clone https://github.com/leneghan/scala_dojo_02_funswithlists.git
</pre>
  </div>
</div>

<h4 style="background-color: white; font-family: Arial, Helvetica, FreeSans, sans-serif; font-size: 13pt; margin-bottom: 4px; margin-left: 0px; margin-right: 0px; margin-top: 25px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px; text-align: left;">
  <a href="http://www.blogger.com/blogger.g?blogID=3769493724401867109" name="ScalaDojo02-funswithlists-Gettingstartedwithgit"></a>Getting started with git
</h4>

<div style="background-color: white; font-family: Arial, Helvetica, FreeSans, sans-serif; font-size: 14px; line-height: 17px; margin-bottom: 10px; margin-top: 10px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px; text-align: left;">
  If you dont have git currently installed you can download it <a class="external-link" href="http://git-scm.com/download" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">here from the git website</a>. When using Git I found this one page cheat sheet useful, it also comes with some pointers about good VCS practice, <a class="external-link" href="http://www.git-tower.com/files/cheatsheet/Git_Cheat_Sheet_grey.pdf" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">Git_Cheat_Sheet_grey.pdf</a>
</div>

<h4 style="background-color: white; font-family: Arial, Helvetica, FreeSans, sans-serif; font-size: 13pt; margin-bottom: 4px; margin-left: 0px; margin-right: 0px; margin-top: 25px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px; text-align: left;">
  <a href="http://www.blogger.com/blogger.g?blogID=3769493724401867109" name="ScalaDojo02-funswithlists-Resources"></a>Resources
</h4>

<ul style="background-color: white; font-family: Arial, Helvetica, FreeSans, sans-serif; font-size: 14px; line-height: 17px; text-align: left;">
  <li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
    <a class="external-link" href="http://www.scalatest.org/" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">ScalaTest website</a>
  </li>
  <li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
    <a class="external-link" href="http://twitter.github.com/scala_school/" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">Twitters Scala School</a>
  </li>
  <li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
    <a class="external-link" href="https://github.com/" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">GitHub website</a>
  </li>
  <li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
    <a class="external-link" href="http://git-scm.com/download" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">Git download location</a>
  </li>
</ul>