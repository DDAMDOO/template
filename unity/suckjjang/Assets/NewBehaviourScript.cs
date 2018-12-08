using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class NewBehaviourScript : MonoBehaviour
{
    //1번 예
    public Transform target;//추적할 타겟 변수

    private Transform tr; //카메라 자신의 변수

    void Start()
    {
    }

    // Update is called once per frame
    void Update()
    {
        tr.LookAt(target);
    }

    //public Transform from;
    //public Transform to;

    //public Vector3 objToTargetVector = to.position - from.position;

}