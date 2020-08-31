import React, { useState, Component } from 'react';
import Container from 'react-bootstrap/Container';
import Carousel from 'react-bootstrap/Carousel';
import ShowCard from './ShowCard';

class Hand extends Component {

  render() {

    let set = [];
    let num = this.props.initial ? 1 : this.props.hand.cards.length; //conditional operater

    for (let i = 0; i < num; i++) {
      //     let randNum = this.props.initial ? 0 : Math.floor(Math.random() * 53);
      set.push(
        <Carousel.Item><ShowCard className="card" initial={this.props.initial} card={this.props.initial ? {} : this.props.hand.cards[i]}></ShowCard> </Carousel.Item>
      );
      // if(num == 0){
      //   let bool = true;
      // }
    }
//console.log("Card", this.props.card.color);
    return (
      <div>
        <h2 id="playerTitle">Player  {this.props.name}</h2>
        <Carousel className="hand" interval={null}>
          {set}
        </Carousel>
        <h4 id="nrt"> {this.props.name} is about to play: {this.props.card !== null ? this.props.card.color && this.props.card.value : " "} </h4>
      </div>
    ); //Display fixed card in showcard inside container in Showcard tag with img tag
  } 
}
export default Hand;