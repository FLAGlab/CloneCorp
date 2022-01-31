import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        primarySwatch: Colors.blue,
        visualDensity: VisualDensity.adaptivePlatformDensity,
      ),
      home: MyHomePage(title: 'Home Page'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  MyHomePage({Key key, this.title}) : super(key: key);
  final String title;

  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  int _counter = 0;

  //increase the value of the counter
  void _incrementCounter() {
    setState(() {
      _counter++;
    });
  }

  //reset the counter value to 0-
  void _reset(){
    setState(() {
      _counter =0;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
         title: Text(widget.title),
      ),
      body: Center(
         child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            Text(
              '$_counter',style: Theme.of(context).textTheme.headline4,
            ),
            RaisedButton(child: Text("Increase"), onPressed: ()=> _incrementCounter(),),
            SizedBox(height:10),
            RaisedButton(child: Text("Reset"), onPressed: ()=> _reset())
          ],
        ),
      ),
      );
  }
}