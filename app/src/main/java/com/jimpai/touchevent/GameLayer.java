package com.jimpai.touchevent;

import android.view.MotionEvent;

import org.cocos2d.layers.CCLayer;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.nodes.CCSprite;
import org.cocos2d.types.CGPoint;

/**
 * Created by jimpai on 15/4/24.
 */
public class GameLayer extends CCLayer {
    CCSprite player;
    public GameLayer() {
        this.setIsTouchEnabled(true);
        /*player = CCSprite.sprite("player.png");
        this.addChild(player);

        CGPoint cgPoint = CGPoint.ccp(100, 100);
        player.setPosition(cgPoint);*/
    }

    // 當用戶開始觸摸屏幕時，執行該方法
    @Override
    public boolean ccTouchesBegan(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();

        CGPoint p1 = CGPoint.ccp(x, y);
        CGPoint p2 = CCDirector.sharedDirector().convertToGL(p1);
        System.out.println("ccTouchesBegan: p1.x:"
            + p1.x + ", p1.y:" + p1.y + ", p2.x:" + p2.x + ", p2.y:" + p2.y);
        return super.ccTouchesBegan(event);
    }

    // 當用戶的手指離開屏幕時，執行該方法
    @Override
    public boolean ccTouchesMoved(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();
        System.out.println("ccTouchesMoved: x:" + x + ", y:" + y);
        return super.ccTouchesMoved(event);
    }

    // 當用戶手指在屏幕上移動時，執行該方法
    @Override
    public boolean ccTouchesEnded(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();
        System.out.println("ccTouchesEnd: x:" + x + ", y:" + y);
        return super.ccTouchesEnded(event);
    }
}
