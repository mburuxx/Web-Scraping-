var scene = new THREE.Scene();
var camera = new THREE.PerspectiveCamera( 75, window.innerWidth/window.innerHeight, 0.1, 1000 );

var renderer = new THREE.WebGLRenderer();
renderer.setSize( window.innerWidth, window.innerHeight );
document.body.appendChild( renderer.domElement );

var geometry = new THREE.BoxGeometry( 1, 1, 1 );
var material = new THREE.MeshBasicMaterial( { color: 0x00ff00 } );
var cube = new THREE.Mesh( geometry, material );
scene.add( cube );

var geometry = new THREE.PyramidGeometry( 1, 1, 1, 3, 3, 3 );
var material = new THREE.MeshBasicMaterial( { color: 0xff0000 } );
var pyramid = new THREE.Mesh( geometry, material );
scene.add( pyramid );

var geometry = new THREE.SphereGeometry( 1, 32, 32 );
var material = new THREE.MeshBasicMaterial( { color: 0x0000ff } );
var sphere = new THREE.Mesh( geometry, material );
scene.add( sphere );

var geometry = new THREE.CylinderGeometry( 5, 5, 20, 32 );
var material = new THREE.MeshBasicMaterial( {color: 0xffff00} );
var cylinder = new THREE.Mesh( geometry, material );
scene.add( cylinder );

camera.position.z = 5;

var animate = function () {
	requestAnimationFrame( animate );

	cube.rotation.x += 0.01;
	cube.rotation.y += 0.01;
	pyramid.rotation.x += 0.01;
	pyramid.rotation.y += 0.01;
	sphere.rotation.x += 0.01;
	sphere.rotation.y += 0.01;
	cylinder.rotation.x += 0.01;
	cylinder.rotation.y += 0.01;

	renderer.render( scene, camera );
};

animate();