import React from 'react';
import cardInfo from './card-info';
import Carousel from 'react-bootstrap/Carousel';
import translateCard from './translateCard';

function ShowCard(props) {

  let card;

  if (props.initial) {
    card = <img src={process.env.PUBLIC_URL + '/small_cards/0_card_back.png'} alt='back' />
  }
  else {
    // console.log("111", props.card)
    // if(typeof props.randNum !== "undefined"){
    //   card = <img src={process.env.PUBLIC_URL + '/small_cards/' +  cardInfo[props.randNum].filename} alt='img' />
    // }
    // else{
    card = <img src={process.env.PUBLIC_URL + '/small_cards/' + translateCard(props.card.color, props.card.value) + '.png'} alt='img' />
}  
  return (<p>
    {card}
  </p>
  )
}

export default ShowCard; 