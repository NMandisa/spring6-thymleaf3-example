package za.co.squnga.facade.impl;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import za.co.squnga.entity.basket.Basket;
import za.co.squnga.entity.basket.BasketItem;
import za.co.squnga.facade.BasketFacade;
import za.co.squnga.repository.basket.BasketItemRepository;
import za.co.squnga.repository.basket.BasketRepository;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@Component
@Scope("singleton")
public class DefaultBasketFacade implements BasketFacade {
    private static final Logger LOGGER  = LoggerFactory.getLogger(BasketFacade.class.getName());
    private ModelMapper modelMapper;
    @Autowired
    public ModelMapper modelMapper( ModelMapper modelMapper){
        return this.modelMapper=modelMapper;
    }

    private BasketRepository basketRepository;
    private BasketItemRepository basketItemRepository;
    @Autowired
    public DefaultBasketFacade (BasketItemRepository basketItemRepository,BasketRepository basketRepository){
        super();
         this.basketItemRepository=basketItemRepository;
         this.basketRepository=basketRepository;
    }
    @Autowired
    public BasketRepository setBasketRepository(BasketRepository basketRepository){
        return this.basketRepository=basketRepository;
    }
    @Override
    public Collection<?> getAllBaskets() {
        return basketRepository.findAll();
    }
    @Override
    public Basket createBasket(Basket basket) {
        return basketRepository.save(basket);
    }
    @Override
    public void editBasket(Long basketId,Basket basket) {
        /*Basket basket1 = basketRepository.findAllById(basketId);
        //Basket basket2 = this.modelMapper.map(basket1,basket);
        basketRepository.save(basket);*/

    }

    @Override
    public void deleteBasket(Long basketId) {
        basketRepository.deleteById(basketId);
    }
    @Override
    public Basket addBasketItem(Long basketId,BasketItem basketItem) {
      /*  Basket basket = basketRepository.findAllById(basketId);
        basket.addBasketItem(basketItem);
        return basketRepository.save(basket);*/
        return null;
    }

    @Override
    public void removeBasketItem(Long basketId,Long basketItemId) {
       /* Basket basket = basketRepository.findAllById(basketId);
        Optional<BasketItem> basketItem = basketItemRepository.findById(basketItemId);
        basket.removeBasketItem(new BasketItem().setBasket(basket));
        basketRepository.save(basket);*/
    }
}
